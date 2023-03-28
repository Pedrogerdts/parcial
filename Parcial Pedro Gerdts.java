import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        double  precio  =  calcularpreciodeboletas ( "Dinamix" ,  4 ,  "hora no pico" ,  "tarjeta del cinema" ,  false ) ;
        System.out.println( "El precio por 4 boletas: " +  precio ) ;
    } 
    
    public static double calcularpreciodeboletas (String tipoSala, int numBoletas ,String horaFuncion ,String tipoPago ,boolean reserva ) {
        
  
   Map<String, Integer> precios = new HashMap<String, Integer>();
    precios.put("Dinamix" , 18800);
    precios.put("3D" , 15500);
    precios.put("2D" , 11300);

 
  double  descuentoHoraNoPico  =  0.1 ;
  double  descuentoNumBoletas  =  500 ;
  double  recargoReserva  =  2000 ;
  double  descuentoTarjetaCinema  =  0.05 ;
  double  aumentoHoraPico3D2D  =  0.25 ;
  double  aumentoHoraPicoDinamix  =  0.5 ;
  
  
  double  precio  =  precios.get(tipoSala);
  if  ( horaFuncion  ==  "hora no pico" )  {
    precio  *=  1  -  descuentoHoraNoPico ;
    if  ( numBoletas  >=  3 )  {
      precio -=  descuentoNumBoletas  *  ( numBoletas  -  2 ) ;
    }
  }  
  else {
    
    if  ( tipoSala  ==  "3D"  ||  tipoSala  ==  "2D" )  {
      precio  *=  1  +  aumentoHoraPico3D2D ;
    }  
    else {
      precio  *=  1  +  aumentoHoraPicoDinamix ;
    }
  }

  if  ( tipoPago  ==  "tarjeta del cine" )  {
    precio  *=  1  -  descuentoTarjetaCinema ;
  }

  if  ( reserva )  {
    precio  +=  recargoReserva ;
  }

  
  return  precio  *  numBoletas ;
  }
}