package com.example.settingcreatorhelper.model

import android.graphics.Typeface
import android.widget.ImageView
import com.example.settingcreatorhelper.R

object SettingConstants {
    // Padding
    const val DEFAULT_PADDING_LEFT = 16   // dp
    const val DEFAULT_PADDING_RIGHT = DEFAULT_PADDING_LEFT
    const val DEFAULT_PADDING_TOP = 8     // dp
    const val DEFAULT_PADDING_BOTTOM = DEFAULT_PADDING_TOP

    // ICON
    const val DEFAULT_ICON_WIDTH = 30   // dp
    const val DEFAULT_ICON_HEIGHT = 30  // dp
    const val DEFAULT_ICON_RADIUS = 4   // dp
    val DEFAULT_ICON_SCALE_TYPE = ImageView.ScaleType.CENTER_CROP
    const val DEFAULT_ICON_PLACEHOLDER = R.drawable.default_img_placeholder

    // Text
    val DEFAULT_TEXT_TYPEFACE: Typeface = Typeface.DEFAULT // normal
    // Hint Text
    const val DEFAULT_HINT_TEXT_COLOR = "#999999"
    const val DEFAULT_HINT_TEXT_SIZE = 14
    // Main Text
    const val DEFAULT_MAIN_TEXT_COLOR = "#333333"
    const val DEFAULT_MAIN_TEXT_SIZE = 16

    // CheckBox
    const val DEFAULT_CHECKBOX_BG = R.drawable.default_checkbox_selector

    // ViewType
    const val VIEW_TYPE_CHECKBOX = 1
    const val VIEW_TYPE_NORMAL = 2
    const val VIEW_TYPE_CUSTOM = 10
    const val VIEW_TYPE_NOT_FOUNT = -11

    // click
    const val DEFAULT_CLICK_BG = R.drawable.default_white_gray_selector
}