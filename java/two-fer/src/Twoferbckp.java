public class Twoferbckp {
    public String twofer(String name) {
        // imp 1
        /*if (name == null){
            return "One for you, one for me.";
        } else if (name == "") {
            return "One for , one for me.";
        } else {

            return "One for "+name+", one for me.";
        }
        */
        // imp 2
        /*
        if (name == null) {
            return "One for you, one for me.";
        }
        else {
            switch(name) {
                case "":
                    return "One for , one for me.";
                default:
                    return "One for "+name+", one for me.";
                }
        }
        */
        // imp 3 w/ ternary operator
        public class Twofer {
            public String twofer(String name) {
                // imp 1
                /*if (name == null){
                    return "One for you, one for me.";
                } else if (name == "") {
                    return "One for , one for me.";
                } else {
        
                    return "One for "+name+", one for me.";
                }
                */
                // imp 2
                /*
                if (name == null) {
                    return "One for you, one for me.";
                }
                else {
                    switch(name) {
                        case "":
                            return "One for , one for me.";
                        default:
                            return "One for "+name+", one for me.";
                        }
                }
                */
                // imp 3 w/ ternary operator
                String result = name != null ? "One for "+name+", one for me."  : "One for you, one for me.";
                return result;
            }
        }
        
    }
}
