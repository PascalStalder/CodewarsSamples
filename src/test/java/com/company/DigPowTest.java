package com.company;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class DigPowTest {

    @Test
    void testCalcDigPowEntering0And0returns1() {
        assertThat(DigPow.calcDigPow(0, 0)).isEqualTo(1);
    }

    @Test
    void testCalcDigPowEnteringASingleDigitWithPow0() {
        assertThat(DigPow.calcDigPow(8, 0)).isEqualTo(1);
        assertThat(DigPow.calcDigPow(3, 0)).isEqualTo(1);
        assertThat(DigPow.calcDigPow(5, 0)).isEqualTo(1);
        assertThat(DigPow.calcDigPow(7, 0)).isEqualTo(1);
    }

    @Test
    void testCalcDigPowEnteringTwoDigitsWithPow0() {
        assertThat(DigPow.calcDigPow(43, 0)).isEqualTo(4);
    }

    @Test
    public void testDigPowWithInt89Power1() {
        assertThat(DigPow.digPow(89, 1)).isEqualTo(1);
    }

    @Test
    public void testDigPowWithInt92Power1() {
        assertThat(DigPow.digPow(92, 1)).isEqualTo(-1);

    }

    @Test
    public void testDigPowWithInt46288Power3() {
        assertThat(DigPow.digPow(46288, 3)).isEqualTo(51);
    }

}