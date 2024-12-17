package com.udla.LSP.Original;

class Fish extends Animal {
    @Override
    public void walk() {
        throw new UnsupportedOperationException("Fish can't walk.");
    }
}