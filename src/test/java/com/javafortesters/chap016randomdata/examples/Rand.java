package com.javafortesters.chap016randomdata.examples;

import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Rand {

    @Test
    public void randomTest(){
        double rnd = Math.random();
        System.out.println(
                String.format(
                        "generated %f as random number", rnd));
        assertThat(rnd < 1.0d, is(true));
        assertThat(rnd >= 0.0d, is(true));
    }

    @Test
    public void otherRandomMethods(){

        Random generate = new Random();

        boolean randomBoolean = generate.nextBoolean();
        System.out.println(randomBoolean);

        int randomInt = generate.nextInt();
        System.out.println(randomInt);

        int randomIntRange = generate.nextInt(12);

        long randomLong = generate.nextLong();
        double randomDouble = generate.nextDouble();
        double randomGaussian = generate.nextGaussian();
        System.out.println(randomGaussian);
        byte[] bytes = new byte[generate.nextInt(100)];
        generate.nextBytes(bytes);
    }

    @Test
    public void steed(){
        long currentSeed = System.currentTimeMillis();
        System.out.println("seed used: " + currentSeed);

        String validValues = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        Random generate = new Random();


    }
}
