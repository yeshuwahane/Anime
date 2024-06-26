package presentation.home.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import presentation.utils.shimmerLoadingAnimation


@Composable
fun AnimeDashboardTopShimmer() {
    Column(
        modifier = Modifier.fillMaxWidth().wrapContentHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        ComponentImageSlider()

    }
}

@Composable
fun ComponentTitleShimmer(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(8.dp))
            .background(color = Color.LightGray)
            .size(height = 15.dp, width = 35.dp)
            .shimmerLoadingAnimation()
    )
}


@Composable
fun ComponentImageSlider() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .clip(RectangleShape)
            .background(color = Color.Black, shape = RoundedCornerShape(10.dp))
            .padding(10.dp)
            .shimmerLoadingAnimation()

    )

}


@Composable
fun ComponentPoster() {
    Box(
        modifier = Modifier
            .padding(10.dp)
            .height(250.dp)
            .fillMaxWidth()
//            .shadow(8.dp, RectangleShape)
            .clip(RectangleShape)
            .background(color = Color.Black, shape = RoundedCornerShape(10.dp))
            .padding(10.dp)
            .shimmerLoadingAnimation()
    )
}

@Composable
fun ComponentCircle() {
    Box(
        modifier = Modifier
            .background(color = Color.LightGray, shape = CircleShape)
            .size(80.dp)
            .padding(horizontal = 10.dp)
            .shimmerLoadingAnimation(),
    )
}

@Composable
fun ComponentRectangleLineLong() {
    Box(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(8.dp))
            .background(color = Color.LightGray)
            .size(height = 20.dp, width = 50.dp)
            .shimmerLoadingAnimation()
    )
}

@Composable
fun ComponentRectangleLineShort() {
    Box(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(8.dp))
            .background(color = Color.LightGray)
            .size(height = 15.dp, width = 35.dp)
            .shimmerLoadingAnimation()
    )
}

@Composable
fun ComponentRectangleLineMedium() {
    Box(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(8.dp))
            .background(color = Color.DarkGray)
            .size(height = 25.dp, width = 170.dp)
            .shimmerLoadingAnimation()
    )
}