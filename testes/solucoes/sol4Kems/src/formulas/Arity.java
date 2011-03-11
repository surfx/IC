/*
 * Created on 15/10/2004
 *
 */
package formulas;

/** Represent the arity of a connective.
 * 
 * @author Adolfo Gustavo Serra Seca Neto
 *
 */
public class Arity {
    
    public static final Arity UNARY = new Arity();
    public static final Arity BINARY = new Arity();
    public static final Arity ZEROARY = new Arity();
    public static final Arity NARY = new Arity();
    
    private Arity() {
    }

}