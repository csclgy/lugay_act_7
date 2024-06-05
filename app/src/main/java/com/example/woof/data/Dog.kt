
package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.kyojuro, R.string.dog_name_1, 20, R.string.dog_description_1),
    Dog(R.drawable.giyu, R.string.dog_name_2, 21, R.string.dog_description_2),
    Dog(R.drawable.sanemi, R.string.dog_name_3, 21, R.string.dog_description_3),
    Dog(R.drawable.muichiro, R.string.dog_name_4, 14, R.string.dog_description_4),
    Dog(R.drawable.gyomei, R.string.dog_name_5, 27, R.string.dog_description_5),
    Dog(R.drawable.tengen, R.string.dog_name_6, 23, R.string.dog_description_6),
    Dog(R.drawable.obanai, R.string.dog_name_7, 21, R.string.dog_description_7),
    Dog(R.drawable.mitsuri, R.string.dog_name_8, 19, R.string.dog_description_8),
    Dog(R.drawable.shinobu, R.string.dog_name_9, 18, R.string.dog_description_9)
)
