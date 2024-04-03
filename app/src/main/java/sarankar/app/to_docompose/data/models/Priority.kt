package sarankar.app.to_docompose.data.models

import androidx.compose.ui.graphics.Color
import sarankar.app.to_docompose.ui.theme.HighPriorityColor
import sarankar.app.to_docompose.ui.theme.LowPriorityColor
import sarankar.app.to_docompose.ui.theme.MediumPriorityColor
import sarankar.app.to_docompose.ui.theme.NonePriorityColor


enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor),
}