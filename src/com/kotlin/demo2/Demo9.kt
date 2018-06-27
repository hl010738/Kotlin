package com.kotlin.demo2

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import javax.swing.JButton
import javax.swing.JFrame

//Kotlin实现window事件

fun main(args: Array<String>) {
    val jFrame = JFrame("Myframe")
    val jButton = JButton("Mybutton")

    jFrame.addWindowListener(object : WindowListener{
        override fun windowDeiconified(e: WindowEvent?) {
        }

        override fun windowClosing(e: WindowEvent?) {
            println("window closing")
        }

        override fun windowClosed(e: WindowEvent?) {
            println("window closed")
        }

        override fun windowActivated(e: WindowEvent?) {
            println("window activated")
        }

        override fun windowDeactivated(e: WindowEvent?) {
        }

        override fun windowOpened(e: WindowEvent?) {
            println("window opened")
        }

        override fun windowIconified(e: WindowEvent?) {
        }
    })

    jButton.addActionListener(object : ActionListener{
        override fun actionPerformed(e: ActionEvent?) {
            println("Button clicked")
        }

    })

    jFrame.add(jButton)
    jFrame.pack()
    jFrame.isVisible = true
    jFrame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
}