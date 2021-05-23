package joshua;

import java.util.Collections;

class StaticFactory {
    static StaticFactory staticFactory;

    private StaticFactory() {

    }

    public static StaticFactory getInstance() {
        if (staticFactory == null) {
            staticFactory = new StaticFactory();
        }

        return staticFactory;
    }

}
