public class TablaSah {

    public enum TipPiesa {
        P, T, N, C, R, Q, S
    }

    private Piesa[][] tablaSah;

    public TablaSah() {
        this.tablaSah = new Piesa[8][8];
        initializareTabla();
    }

    private void initializareTabla() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i == 0 && j == 0) || (i == 0 && j == 7)) {
                    tablaSah[i][j] = new Piesa(i, j, Piesa.TipPiesa.T, 0);  // White Rook
                } else if ((i == 7 && j == 0) || (i == 7 && j == 7)) {
                    tablaSah[i][j] = new Piesa(i, j, Piesa.TipPiesa.T, 1);  // Black Rook
                } else if ((i == 0 && (j == 1 || j == 6))) {
                    tablaSah[i][j] = new Piesa(i, j, Piesa.TipPiesa.N, 0);  // White Knight
                } else if ((i == 7 && (j == 1 || j == 6))) {
                    tablaSah[i][j] = new Piesa(i, j, Piesa.TipPiesa.N, 1);  // Black Knight
                } else if ((i == 0 && (j == 2 || j == 5))) {
                    tablaSah[i][j] = new Piesa(i, j, Piesa.TipPiesa.C, 0);  // White Bishop
                } else if ((i == 7 && (j == 2 || j == 5))) {
                    tablaSah[i][j] = new Piesa(i, j, Piesa.TipPiesa.C, 1);  // Black Bishop
                } else if (i == 0 && j == 4) {
                    tablaSah[i][j] = new Piesa(i, j, Piesa.TipPiesa.Q, 0);  // White Queen
                } else if (i == 7 && j == 4) {
                    tablaSah[i][j] = new Piesa(i, j, Piesa.TipPiesa.Q, 1);  // Black Queen
                } else if (i == 0 && j == 3) {
                    tablaSah[i][j] = new Piesa(i, j, Piesa.TipPiesa.R, 0);  // White King
                } else if (i == 7 && j == 3) {
                    tablaSah[i][j] = new Piesa(i, j, Piesa.TipPiesa.R, 1);  // Black King
                } else if (i == 1) {
                    tablaSah[i][j] = new Piesa(i, j, Piesa.TipPiesa.P, 0);  // White Pawn
                } else if (i == 6) {
                    tablaSah[i][j] = new Piesa(i, j, Piesa.TipPiesa.P, 1);  // Black Pawn
                } else {
                    tablaSah[i][j] = new Piesa(i, j, Piesa.TipPiesa.S, -1);  // Empty
                }
            }
        }
    }

    private boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    public void muta(int a, int b, int aa, int bb) {
        if (!isWithinBounds(a, b) || !isWithinBounds(aa, bb)) {
            System.out.println("Coordonate in afara tablei.");
            return;
        }
        Piesa piesa = tablaSah[a][b];
        if (piesa == null || piesa.getTip() == Piesa.TipPiesa.S) {
            System.out.println("Nu există piesă la coordonatele de pornire.");
            return;
        }
        if (tablaSah[aa][bb].getCuloare() == piesa.getCuloare()) {
            System.out.println("Destinația are deja o piesă de aceeași culoare.");
            return;
        }

        String tipPiesa = aflareelement(a, b).toLowerCase();
        boolean moveValid = switch (tipPiesa) {
            case "p" -> isValidPawnMove(a, b, aa, bb, piesa.getCuloare());
            case "t" -> isValidRookMove(a, b, aa, bb);
            case "n" -> isValidKnightMove(a, b, aa, bb);
            case "c" -> isValidBishopMove(a, b, aa, bb);
            case "q" -> isValidQueenMove(a, b, aa, bb);
            case "r" -> isValidKingMove(a, b, aa, bb);

            case "P" -> isValidPawnMove(a, b, aa, bb, piesa.getCuloare());
            case "T" -> isValidRookMove(a, b, aa, bb);
            case "N" -> isValidKnightMove(a, b, aa, bb);
            case "C" -> isValidBishopMove(a, b, aa, bb);
            case "Q" -> isValidQueenMove(a, b, aa, bb);
            case "R" -> isValidKingMove(a, b, aa, bb);
            default -> false;
        };
        if (moveValid) {
            mutaPiesa(a, b, aa, bb);
        } else {
            System.out.println("Mutare invalidă pentru piesa selectată.");
        }
    }

    private boolean isValidPawnMove(int a, int b, int aa, int bb, int culoare) {
        int direction = (culoare == 0) ? 1 : -1;
        return (a + direction == aa && b == bb && tablaSah[aa][bb].getTip() == Piesa.TipPiesa.S) ||
                (a + direction == aa && Math.abs(b - bb) == 1 && tablaSah[aa][bb].getCuloare() != culoare);
    }

    private boolean isValidRookMove(int a, int b, int aa, int bb) {
        return (a == aa || b == bb);
    }

    private boolean isValidKnightMove(int a, int b, int aa, int bb) {
        return (Math.abs(a - aa) == 2 && Math.abs(b - bb) == 1) || (Math.abs(a - aa) == 1 && Math.abs(b - bb) == 2);
    }

    private boolean isValidBishopMove(int a, int b, int aa, int bb) {
        return Math.abs(a - aa) == Math.abs(b - bb);
    }

    private boolean isValidQueenMove(int a, int b, int aa, int bb) {
        return isValidRookMove(a, b, aa, bb) || isValidBishopMove(a, b, aa, bb);
    }

    private boolean isValidKingMove(int a, int b, int aa, int bb) {
        return Math.abs(a - aa) <= 1 && Math.abs(b - bb) <= 1;
    }

    private void mutaPiesa(int a, int b, int aa, int bb) {
        tablaSah[aa][bb].setTip(tablaSah[a][b].getTip());
        tablaSah[a][b].setTip(Piesa.TipPiesa.S);
    }

    public String aflareelement(int i, int j) {
        Piesa piesa = tablaSah[i][j];
        if (piesa == null) return " ";
        String c = (piesa.getCuloare() == 0) ? piesa.getTip().toString().toLowerCase() : piesa.getTip().toString().toUpperCase();
        return c.equalsIgnoreCase("S") ? " " : c;
    }

    public String[][] ttoString() {
        String[][] c = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                c[i][j] = aflareelement(i, j);
            }
        }
        return c;
    }

    public static void main(String[] args) {
        TablaSah board = new TablaSah();
        String[][] c1 = board.ttoString();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(c1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n");
        board.muta(1, 1, 2, 1);

        c1 = board.ttoString();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(c1[i][j] + " ");
            }
            System.out.println();
        }

        board.muta(1, 2, 3, 3);
        c1 = board.ttoString();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(c1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
