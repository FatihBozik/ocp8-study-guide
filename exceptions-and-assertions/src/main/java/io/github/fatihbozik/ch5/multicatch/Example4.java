package io.github.fatihbozik.ch5.multicatch;

import java.io.IOException;
import java.time.format.DateTimeParseException;

public class Example4 {
    public static void main(String[] args) {
        Example4 example4 = new Example4();
        example4.doesNotCompile();
    }

    private void doesNotCompile() { // METHOD DOES NOT COMPILE
//        try {
//            mightThrow();
//        } catch (FileNotFoundException | IllegalStateException e) {
//        } catch (InputMismatchException e | MissingResourceException e){  // <1>
//        } catch (SqlException | ArrayIndexOutOfBoundsException e){        // <2>
//        } catch(FileNotFoundException | IllegalArgumentException e) {     // <3>
//        } catch(Exception e) {                                            // <4>
//        } catch(IOException e) {
//        }
    }

    private void mightThrow() throws DateTimeParseException, IOException {
        // throw or not throw
    }
}
