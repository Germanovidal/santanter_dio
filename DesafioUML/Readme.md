classDiagram
    Iphone <|-- ReprodutorMusical
    Iphone <|-- AparelhoTelefonico
    Iphone <|-- NavegadorInternet
    class ReprodutorMusical{
      - String musica
      + selecionarMusica(String musica)
      + tocar()
      + pausar()
    }
    class AparelhoTelefonico{
      - int numero  
      + ligar(String numero)
      + atender()
      + iniciarCorreioVoz()
    }
    class NavegadorInternet{
      - String url
      + ExibirPagina(String url)
      + adicionarNovaAba()
      + atualizarPagina()
    }
