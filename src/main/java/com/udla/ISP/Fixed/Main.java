package com.udla.ISP.Fixed;

import com.udla.ISP.Original.Device;
import com.udla.ISP.Original.Phone;

public class Main {
    public static void main(String[] args) {
        Device phone = new Phone();
        DisposableCamera camera = new DisposableCamera();

        phone.turnOn();
        phone.charge();

        camera.turnOn();
//        camera.charge();
    }
}