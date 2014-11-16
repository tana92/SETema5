package Clase;

/**
 * Created by Tanasescu on 11/16/2014.
 *
 * aici aleg ce interfata folosesc in cazul nostru "Continut"
 *
 */
public class FactoryProducer {

        public static AbstractFactory getFactory(String alege)
        {
            if(alege.equalsIgnoreCase("Continut"))
            {
                return new SticlaFactory();
            }
            else
                return null;
        }
}
