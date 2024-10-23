package com.tgaetaprojects.androidopenglexample

// TODO("Optimize Imports")
import android.opengl.GLES32.*
import android.opengl.GLSurfaceView.Renderer
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

class AppRenderer : Renderer {
    override fun onSurfaceCreated(ignored: GL10?, eglConfig: EGLConfig?) {
        glClearColor(1.0f, 0.0f, 0.0f, 1.0f)
    }

    override fun onSurfaceChanged(ignored: GL10?, width: Int, height: Int) {
        glViewport(0, 0, width, height)
    }

    override fun onDrawFrame(ignored: GL10?) {
        glClear(GL_COLOR_BUFFER_BIT)
    }
}