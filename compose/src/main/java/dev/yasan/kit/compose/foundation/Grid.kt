package dev.yasan.kit.compose.foundation

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.dp

private val grid = 8.dp

@Stable
fun grid(multiplier: Float) = grid * multiplier

@Stable
fun grid(multiplier: Int) = grid * multiplier

@Stable
fun grid() = grid