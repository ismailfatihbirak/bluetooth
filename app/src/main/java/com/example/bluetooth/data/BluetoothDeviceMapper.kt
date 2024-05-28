package com.example.bluetooth.data

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.example.bluetooth.domain.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}