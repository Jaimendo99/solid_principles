package com.udla.ISP.Fixed;

public class DisposableCamera implements Device{
    @Override
    public void turnOn() {
        System.out.println("Disposable Camera is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Disposable Camera is turning off.");
    }
}
