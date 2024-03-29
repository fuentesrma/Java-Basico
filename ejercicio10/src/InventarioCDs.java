import java.util.ArrayList;
import java.util.List;


public class InventarioCDs {
	final int CAPACIDAD_CDS =20;
	final int CAPACIDAD_CANCIONES =20;
	private List<Disco> cds;
	private List<Canciones> song;  
	public InventarioCDs(){
		cds=new ArrayList<Disco>(CAPACIDAD_CDS);
		for(int i=0;i<CAPACIDAD_CDS;i++){
			cds.add(null);
		}
		song=new ArrayList<Canciones>(CAPACIDAD_CANCIONES);
		for(int i=0;i<CAPACIDAD_CANCIONES;i++){
			song.add(null);
		}
	}
	public void agregarCd(Disco cd){
		int i=0;
		for(Disco d:cds){
			if(d==null){
				cds.remove(i);
				cds.add(i, cd);
				return ;
			}i++;
		}System.out.println("Usted Intento Agregar Otro Disco");
		System.out.println("Estanteria Llena");
		System.out.println("\n");
	}
	public void sacarCd(String nombre){
		int i=0;
		for(Disco d:cds){
			if(d.getTituloD().equals(nombre)){
				cds.remove(i);
				cds.add(i, null);
				break;
			}i++;
		}
	}
	public void verCds(){
		for(Disco cd:cds){
			System.out.println(cd);
		
	}
	}
	public void BuscarCd(String nombre){
		int i=0;
		for(Disco d:cds){
			if(d.getTituloD().equals(nombre)){
				
				System.out.println(d.getTituloD());
			}i++;
		}
	}
	public void BuscarArtista(String artista){
		int i=0;
		for(Disco d:cds){
			if(d.getTituloD().equals(artista)){
				
				System.out.println(d.getTituloD()+d.getArtistaGrupo());
			}i++;
		}
	}
	public void agregarCancion(Canciones can){
		int i=0;
		for(Canciones x:song){
			if(x==null){
				song.remove(i);
				song.add(i, can);
				return ;
			}i++;
		}System.out.println("Usted Intento Agregar Otra cancion");
		System.out.println("El cd ya esta Llena");
		System.out.println("\n");
	}
	public void BuscarCancion(String nombre){
		int i=0;
		for(Canciones x:song){
			if(x.getTituloX().equals(nombre)){
				
				System.out.println(x.getTituloX());
			}i++;
		}
	}
}

class Disco{
	public String tituloD;
	public String artistaGrupo;
	public int anio;
	public int NUMEROCANCIONES=10;
	
	public Disco(String titulo,String artistaGrupo,int anio,int numeroCanciones){
		this.tituloD=titulo;
		this.artistaGrupo=artistaGrupo;
		this.anio=anio;
		this.NUMEROCANCIONES=numeroCanciones;
	}
	public String getTituloD(){
		return tituloD;
	}
	public String getArtistaGrupo(){
		return artistaGrupo;
	}
	public int getAnio(){
		return anio;
	}
	public int getNumeroCanciones(){
		return NUMEROCANCIONES;
	}
	public String toString(){
		String detalle="";
		detalle=detalle+"Titulo: "+this.tituloD;
		detalle=detalle+" Artista: "+this.artistaGrupo;
		detalle=detalle+" A�o: "+this.anio;
		detalle=detalle+" Numero de Canciones: "+this.NUMEROCANCIONES;
		return detalle;
	}
}
class Canciones{
	public String tituloX;
	public String duracion;
	public Canciones(String titulo,String duracion){
		
		this.tituloX=titulo;
		this.duracion=duracion;
	}
	public String getTituloX(){
		return tituloX;
	}
	public String getDuracion(){
		return duracion;
	}
}
class Artistas{
	
}
