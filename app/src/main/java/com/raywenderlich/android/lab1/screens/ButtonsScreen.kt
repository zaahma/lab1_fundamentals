package com.raywenderlich.android.lab1.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

@Composable
fun ExploreButtonsScreen() {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        MyButton()
        MyRadioGroup()
        MyFloatingActionButton()

        BackButtonHandler {
            FundamentalsRouter.navigateTo(Screen.Navigation)
        }
    }
}

@Composable
fun MyButton() {
   
        Button(
            onClick = (},
    colors = Button Defaults.button Colors(background Color = color Resource(id
    = R.color.blue)),
    border = Border Stroke(
            1.dp,
    color = color Resource(id = R.color.black)
    { { this: Row Scope
        Text(
            text = string Resource(id = R.string.set_button),
            color = Color.White
}

@Composable
fun MyRadioGroup() {

        val radio Buttons = list 0f(0, 1, 2) // 1
        val selected Button = remember { mutable State 0f(radio Buttons.first()) }
// 2
        Column { this: Column Scope
            radio Buttons.forEach { index -> //
                3
                val is Selected = index == selected Button.value
                val colors = Radio Button Defaults.colors( // 4
                    selected Color
                            =
                            color Resource(id
                    =
                    R.color.purple_500),
                    unselected Color = color Resource(id = R.color.black),
                    disabled Color = Color.Lightgray
                            Radio Button( // 5
                            colors = colors,
                    selected = isSelected,
                    onClick = { selected Button.value =
                        index
                    } // 6
}

@Composable
fun MyFloatingActionButton() {

        FloatingActionButton(
            onClick = (},
    background Color = color Resource(id = R.color.purple_700),
    content Color = Color.White,
    content =
        {
            Icon(Icons.Filled.Favorite, content Description = "Test FAB")
}