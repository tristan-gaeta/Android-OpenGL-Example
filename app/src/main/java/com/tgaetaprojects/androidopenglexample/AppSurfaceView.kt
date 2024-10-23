package com.tgaetaprojects.androidopenglexample

import android.content.Context
import android.opengl.GLSurfaceView
import android.util.AttributeSet
import javax.microedition.khronos.egl.EGL10
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.egl.EGLContext
import javax.microedition.khronos.egl.EGLDisplay

/**
 *
 */
class AppSurfaceView(context: Context?, attrs: AttributeSet?) : GLSurfaceView(context, attrs) {
    private val renderer : AppRenderer

    init {
        setEGLContextClientVersion(3)
        renderer = AppRenderer()
        setRenderer(renderer)
    }

}