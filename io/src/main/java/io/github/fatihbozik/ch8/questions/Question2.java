package io.github.fatihbozik.ch8.questions;

import java.io.*;

class Bird implements Serializable {
    protected transient String name = "Bridget";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Bird() {
        this.name = "Matt";
    }
}

class Eagle extends Bird implements Serializable {
    {
        this.name = "Janette";
    }

    public Eagle() {
        this.name = "Daniel";
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Question2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectOutputStream out =
                     new ObjectOutputStream(
                             new BufferedOutputStream(
                                     new FileOutputStream("question2.data")
                             )
                     );
        ) {
            out.writeObject(new Eagle());
        }


        try (ObjectInputStream in =
                     new ObjectInputStream(
                             new BufferedInputStream(
                                     new FileInputStream("question2.data")
                             )
                     )) {
            Object eagle = in.readObject();
            if (eagle instanceof Eagle) {
                System.out.println(eagle);
            }
        }

    }
}
