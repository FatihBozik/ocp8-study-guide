package io.github.fatihbozik.io;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

class Bond  // does not implement Serializable
{
    String ticker = "bac";
    double coupon = 8.3;
    Date maturity = new Date();
}

class Portfolio implements Serializable {
    String accountName;
    transient Bond[] bonds = new Bond[]{}; // must be transient because Bond class does not implement Serializable

    private void writeObject(ObjectOutputStream os) throws Exception {
        os.defaultWriteObject();
        os.writeInt(bonds.length);
        //write the state of bond objects
        for (int i = 0; i < bonds.length; i++) {
            os.writeObject(bonds[i].ticker);
            os.writeDouble(bonds[i].coupon);
            os.writeObject(bonds[i].maturity);
        }
    }

    private void readObject(ObjectInputStream os) throws Exception {
        os.defaultReadObject();
        int n = os.readInt();
        this.bonds = new Bond[n];
        //read the state of bond objects.
        for (int i = 0; i < bonds.length; i++) {
            bonds[i] = new Bond();
            bonds[i].ticker = (String) os.readObject();
            bonds[i].coupon = os.readDouble();
            bonds[i].maturity = (java.util.Date) os.readObject();
        }
    }
}
