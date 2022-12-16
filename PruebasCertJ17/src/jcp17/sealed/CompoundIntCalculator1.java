package jcp17.sealed;

import jpc17.var.ErroresJ17;



//falla porque cuando se hereda de una sealed class
//debe especificar el prefijo final, sealed o non-sealed
//public class CompoundIntCalculator1 extends InterestCalculator{ }

//non-sealed abstract class CompoundIntCalculator1 extends InterestCalculator{ }
//final class CompoundIntCalculator1 extends InterestCalculator{ }
//public non-sealed class CompoundIntCalculator1 extends InterestCalculator{ }