package io.github.fatihbozik.ch1.nestedclasses.anonymousclasses.example2;

/**
 * @author Fatih Bozik
 */
public class AnonInner {
    interface SaleTodayOnly {
	int dollarsOff();
    }
    public int admission(int basePrice) {
	SaleTodayOnly sale = new SaleTodayOnly() {
	    @Override
	    public int dollarsOff() {
		return 0;
	    }
	};
	return basePrice - sale.dollarsOff();
    }
}
