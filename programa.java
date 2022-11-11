public class MathRandom {
  public static void main(String[] args) {

    final int LARGOARRAY = 20;
    final int INICIORANGO = 1;
    final int FINRANGO = 10;
    int[] array = new int[LARGOARRAY];

    // CREAR UN ARRAY QUE TOME VALORES ALEATORIOS ENTRE DOS RANGOS DE NÚMEROS

    for (int i = 0; i < LARGOARRAY; i++) {
      array[i] = (int)(Math.random() * (FINRANGO - INICIORANGO + 1) + INICIORANGO);
      System.out.println(array[i]);
    } // Al tener ya creado el system.out.print mostrando el contenido del array, añado este
	// comentario para que lo tome como un cambio para el commit.
  }
}
