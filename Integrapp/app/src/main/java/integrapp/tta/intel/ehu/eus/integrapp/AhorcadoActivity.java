package integrapp.tta.intel.ehu.eus.integrapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AhorcadoActivity extends AppCompatActivity {

    
    private String palabrasArray[]={"AGENDA" , "BORRAGOMA" , "IKASLEA" , "KARPETA" , "KLASEA" , "MAPA" ,
            "AMANTALA" , "ORDENAGAILUA" , "AULKIA" , "PAPERONTZIA"  , "ARTAZIAK" , "LEIHOA"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahorcado);
    }
}
/*
var hombre = new Array("img/urkatua/1.jpg", "img/urkatua/2.jpg", "img/urkatua/3.jpg", "img/urkatua/4.jpg", "img/urkatua/5.jpg",
		"img/urkatua/6.jpg", "img/urkatua/7.jpg", "img/urkatua/8.jpg", "img/urkatua/ahorcado.jpg");
var palabra;
var palabrasArray= new Array( "A G E N D A" , "B O R R A G O M A" , "I K A S L E A" , "K A R P E T A" , "K L A S E A" , "M A P A" ,
		"A M A N T A L A" , "O R D E N A G A I L U A" , "A U L K I A" , "P A P E R O N T Z I A"  , "A R T A Z I A K" ,
		"L E I H O A");
var imagenArray= new Array("agenda","borragoma","ikaslea","karpeta","klasea","mapa","amantala","ordenagailua","aulkia",
		"paperontzia","artaziak","lehioa");
var partes = 0;
var colNueva = 0;
var jugando;
var num=0;
var palabrasRep=new Array();
var cont=0;
var rep;
var numCadena;


function ObtienePalabra() {
   //obtiene la palabra para jugar de forma pseudoaleatoria

   numCadena = Math.round ( Math.random() * 11 );
   var cadena = new String( palabrasArray[numCadena] );
   palabra = cadena.split(" ");
   //cuantas letras tiene la palabra
   num=palabra.length;
   //alert(num);
   //alert(palabra);

}


function DibujaHombre(partes) {
   //dibuja el hombre ahorcado
   //partes indica el numero de partes a dibujar
   var dibujo = "";
   var a = document.getElementById("displayHombre");
   if (partes < 10 && partes!=0){

		a.setAttribute("src",hombre[partes-1]);
   }
   if(partes==0){
		a.setAttribute("src","img/urkatua/0.jpg");
   }
}





function NuevaLetra(visor, letra) {
   //añade letra lista de letras
   visor.displayLetras.value += letra + " ";
   //comprueba si ha de pasar a la siguiente fila
   if(colNueva == 3) {
      visor.displayLetras.value += "\n";
      colNueva = 0;
   } else{
      colNueva++;
   }
}


function Juega(visor, letra) {
   //comprueba si esta jugando
	rep=false;
   if (jugando) {
      //ciclo de jugada
      //1. dibuja la letra y comprueba si acierto
      var acierto = DibujaLetra(visor, letra);
      //2. si no acierto, dibuja hombre y añade letra a la lista
      //alert(palabrasRep);
      if (!acierto){
         DibujaHombre(++partes);
         NuevaLetra(visor, letra);
      }else{
    	  //si es acierto comprobar si la letra es repetida
    	  for(i=0; i<cont; i++){
    		  //si la letra es repetida dibujarla y sumarla como error
    		  if(letra==palabrasRep[i]){
    			  DibujaHombre(++partes);
    		      NuevaLetra(visor, letra);
    		      rep=true;
    		  }
    	  }
    	  if(!rep){
    		  palabrasRep[cont]=letra;
    	  }
    	  cont++;
      }
      //4. comprueba si fin
      if (partes == 9){
         FinJuego(false);
      }else{
    	  if (CompruebaPalabra(visor)){
    		  FinJuego(true);
    	  }
      }
    } else {
         alert('KLIKATU JOLASA BERRIA PARTIDA\n BERRI BAT HASTEKO');
   }
}

function IniciaJuego(visor) {
   //inicializa visor y variables globales
   jugando = true;
   partes = 0;
   colNueva = 0;
   ObtienePalabra();
   DibujaHombre(partes);
   visor.displayPalabra.value = "";
   for (var x = 0; x < palabra.length; x++){
      visor.displayPalabra.value += "_ ";
   }
   visor.displayLetras.value = "";
}

function LimpiarJuego(){
	jugando = false;
	partes = 0;
	colNueva = 0;
	DibujaHombre(partes);
	visor.displayPalabra.value = "";
	for (var x = 0; x < palabra.length; x++){
	      visor.displayPalabra.value += "";
	}
	visor.displayLetras.value = "";
	//$("#pantallaImagen").hide();
}

function CompruebaPalabra(visor) {
   //comprueba si se completo toda la palabra
   var fin = true;
   //obtiene cadena actual
   var cadena = new String(visor.displayPalabra.value);
   //la separa en sus espacios
   var letrasCadena = cadena.split(" ");
   for(var x = 0; x < letrasCadena.length; x++){
      if (letrasCadena[x] == "_"){
         fin = false;
      }
   }
   return fin;
}


function FinJuego(resultado) {
   //indica que si se ha perdido o ganado
   var solucion = "";
   jugando = false ;
   if (resultado) {
      alert("OSO ONDO! HITZA ASMATU DUZU");
   } else {
     //construye la palabra solucion
     for (var x = 0; x < palabra.length; x++){
        solucion += palabra[x];
     }
     alert("HILDA ZAUDE!\n\n HITZA " + solucion+ " ZEN");
   }
}
 */