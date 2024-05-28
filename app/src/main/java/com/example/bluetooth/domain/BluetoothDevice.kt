package com.example.bluetooth.domain

typealias BluetoothDeviceDomain = BluetoothDevice


data class BluetoothDevice(
    val name: String?,
    val address: String
)
