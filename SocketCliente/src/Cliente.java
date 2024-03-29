import java.io.*;
import java.net.*;
public class Cliente{
	private Socket socketCliente;
	private ObjectOutputStream salida;
	private ObjectInputStream entrada;
	private String mensaje;
	
	void run(){
		try{
			//1. creando un soket de conexion al servidor
			socketCliente = new Socket("localhost", 9000);
			System.out.println("Conectado al servidor en el puerto 2004");
			//2. obteniendo los canales de entrada  salida
			salida = new ObjectOutputStream(socketCliente.getOutputStream());
			salida.flush();
			entrada = new ObjectInputStream(socketCliente.getInputStream());
			//3: Comunicandose con el servidor
			do{
				try{
					mensaje = (String) entrada.readObject();
					System.out.println("servidor: " + mensaje);
					enviarMensaje("Hola servidor..");
					mensaje = "bye";
					enviarMensaje(mensaje);
				}
				catch(ClassNotFoundException classNot){
					System.err.println("Datos recibidos en formato desconocido");
				}
			}while(!mensaje.equals("bye"));
		}
		catch(UnknownHostException unknownHost){
			System.err.println("Servidor desconocido!");
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
		finally{
			//4: Cerrando conexion
			try{
				entrada.close();
				salida.close();
				socketCliente.close();
			}
			catch(IOException ioException){
				ioException.printStackTrace();
			}
		}
	}
	void enviarMensaje(String mensaje)
	{
		try{
			salida.writeObject(mensaje);
			salida.flush();
			System.out.println("cliente: " + mensaje);
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		Cliente cliente = new Cliente();
		cliente.run();
                cliente.enviarMensaje("dgdgdgdfhfhfh");
	}
}

