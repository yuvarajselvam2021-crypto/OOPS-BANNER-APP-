public class OOPSBannerApp {
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
    public static CharacterPattern[] createCharacterPatterns() {
        return new CharacterPattern[] {
            new CharacterPattern('O', new String[] {
                "   ***    ",
                " **   **  ",
                "**     ** ",
                "**     ** ",
                "**     ** ",
                "**     ** ",
                "**     ** ",
                " **   **  ",
                "   ***    "
            }),
            new CharacterPattern('P', new String[] {
                "******    ",
                "**    **  ",
                "**     ** ",
                "**    **  ",
                "******    ",
                "**        ",
                "**        ",
                "**        ",
                "**        "
            }),
            new CharacterPattern('S', new String[] {
                "   ***** ",
                "  **     ",
                "**       ",
                "  **     ",
                "   ***   ",
                "     **  ",
                "       **",
                "     **  ",
                " *****   "
            })
        };
    }
    public static String[] getPatternForChar(char ch, CharacterPattern[] patterns) {
        for (CharacterPattern cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return new String[0];
    }
    public static void main(String[] args) {

        CharacterPattern[] patterns = createCharacterPatterns();
        String message = "OOPS";
        for (int i = 0; i < patterns[0].getPattern().length; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getPatternForChar(ch, patterns);
                line.append(pattern[i]);
            }

            System.out.println(line.toString());
        }
    }
}