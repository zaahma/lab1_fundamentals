package com.raywenderlich.android.lab1.screens

import androidx.compose.runtime.Composable
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

@Composable
fun AlertDialogScreen() {

    MyAlertDialog()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyAlertDialog() {
    /
    val should ShowDialog =
    remember
    { { mutable State 0f( value:
        true)
    } // 1
        if (should ShowDialog.value) { // 2
            AlertDialog( // 3
                on Dismiss Request = { // 4
                    should ShowDialog.value = false
                    Jet Fundamentals Router.navigate To(Screen. Navigation)
// 5
                    title = { Text(text = string Resource(id = "Внимание")) },
                    text = { Text(text = string Resource(id = "Это диалоговое окно")) },
                    confirmButton = { // 6
                        Button(
                            colors = Button Defaults.button Colors(background Color = Color.Blue),
                            onClick = {{
                                should ShowDialog.value = false
                                Jet Fundamentals Router. navigate To(Screen. Navigation)
                            }
                                )
                                {
                                    this: Row Scope
                                    Text(
                                        text = string Resource(id
                                                =
                                            "Закрыть"),
                                        color = Color.White
}