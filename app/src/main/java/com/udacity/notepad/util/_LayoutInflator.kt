package com.udacity.notepad.util

import android.content.Context
import android.view.LayoutInflater

val Context.layoutInflator: LayoutInflater
    get() = LayoutInflater.from(this)