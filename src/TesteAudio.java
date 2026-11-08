
import java.util.Scanner;

public class TesteAudio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    
                    ===== MENU PRINCIPAL =====
                    1 - Adicionar música
                    2 - Adicionar podcast
                    3 - Sair
                    Digite a opção desejada:
                    """);

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Musica musica = new Musica();

                    System.out.println("Qual o titulo da musica?");
                    String titulo = scanner.nextLine();
                    musica.setTitulo(titulo);

                    System.out.println("Qual o album da musica?");
                    String album = scanner.nextLine();
                    musica.setAlbum(album);

                    System.out.println("Qual o artista da musica?");
                    String artista = scanner.nextLine();
                    musica.setArtista(artista);

                    System.out.println("Qual o genero da musica?");
                    String genero = scanner.nextLine();
                    musica.setGenero(genero);

                    System.out.println("\nMusica cadastrada com sucesso!");

                    while (true) {
                        System.out.println("\nVoce deseja ouvir a musica " + musica.getTitulo() + "? (s/n)");
                        String escolha = scanner.nextLine();

                        if (escolha.equalsIgnoreCase("n")) {
                            break;

                        } else if (escolha.equalsIgnoreCase("s")) {
                            musica.reproduzir();

                            System.out.println("Total de reproducoes: " + musica.getTotalReproducoes());

                            System.out.println("Voce gostou da musica? (s/n)");
                            escolha = scanner.nextLine();

                            if (escolha.equalsIgnoreCase("s")) {
                                musica.curtir();
                                System.out.println("Total de curtidas: " + musica.getTotalCurtidas());
                            }

                        } else {
                            System.out.println("Opcao invalida!");
                        }
                    }
                    break;

                case 2:
                    Podcast podcast = new Podcast();

                    System.out.println("Qual o titulo do podcast?");
                    String tituloPodcast = scanner.nextLine();
                    podcast.setTitulo(tituloPodcast);

                    System.out.println("Qual o host do podcast?");
                    String host = scanner.nextLine();
                    podcast.setHost(host);

                    System.out.println("Qual a descricao do podcast?");
                    String descricao = scanner.nextLine();
                    podcast.setDescricao(descricao);

                    System.out.println("\nPodcast cadastrado com sucesso!");

                    while (true) {
                        System.out.println("\nVoce deseja ouvir o podcast " + podcast.getTitulo() + "? (s/n)");
                        String escolha = scanner.nextLine();

                        if (escolha.equalsIgnoreCase("n")) {
                            break;

                        } else if (escolha.equalsIgnoreCase("s")) {
                            podcast.reproduzir();

                            System.out.println("Total de reproducoes: " + podcast.getTotalReproducoes());

                            System.out.println("Voce gostou do podcast? (s/n)");
                            escolha = scanner.nextLine();

                            if (escolha.equalsIgnoreCase("s")) {
                                podcast.curtir();
                                System.out.println("Total de curtidas: " + podcast.getTotalCurtidas());
                            }

                        } else {
                            System.out.println("Opcao invalida!");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Obrigado por utilizar nossa plataforma!");
                    return;

                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }
}
