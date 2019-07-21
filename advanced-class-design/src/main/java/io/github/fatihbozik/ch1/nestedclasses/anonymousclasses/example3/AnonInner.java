package io.github.fatihbozik.ch1.nestedclasses.anonymousclasses.example3;

/**
 * @author Fatih Bozik
 */
public class AnonInner {
    interface SaleTodayOnly {
	int dollarsOff();
    }
    public int pay() {
	return admission(5, new SaleTodayOnly() {
	    public int dollarsOff() {
		return 3;
	    }
	});
    }
    public int admission(int basePrice, SaleTodayOnly sale) {
	return basePrice - sale.dollarsOff();
    }
}
