package lab5.dop.test;

import lab5.dop.battle.MyException;

import java.io.IOException;

public class Test implements AutoCloseable{

    @Override
    public void close() throws Exception {
        throw new IOException();
    }

    public static void met() throws Exception {
        try(Test test = new Test()){
            throw new MyException();
        }
    }

    public static void main(String[] args) throws Exception {
        met();
    }
}
