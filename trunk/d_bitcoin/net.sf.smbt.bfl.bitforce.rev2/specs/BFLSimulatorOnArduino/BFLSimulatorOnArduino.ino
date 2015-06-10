#include <SoftwareSerial.h>

String line;
String ZTX, ZCX, ZGX, ZLX, ZFX, ZMX;

void setup()
{
    // setup serial port
    Serial.begin(57600);
//    Serial.println("Starting...");  
    Serial.println("BFL Simulator Started at");
    
    line = String("");
    
    ZTX = String("ZTX");
    ZCX = String("ZCX");
    ZGX = String("ZGX");
    ZLX = String("ZLX");
    ZFX = String("ZFX");
    ZMX = String("ZMX");
}




void ClearBuf(void)
{
  line = String("");
}

void ReadLine(void)
{
  int i;
  i=0;
  char c;
  c = 0;
  ClearBuf();
  while((c!=13) && (c!=10) )
  {
    while (!Serial.available())
    {
// you can do something usefull here
    }
    c = Serial.read();
    //if (echo) Serial.print(c);
    if ((c!=13) && (c!=10))
    {
      line += c;
    }
  }
}


void loop()
{
    ReadLine();
    
    if (line.equals(ZTX)) {
      Serial.println("Got ZTX");
      //Serial.println(getZTXVoltages());
    } else if (line.equals(ZCX)) {
      Serial.println("Got ZCX\nidiot\nbum\n!!!");
      //Serial.println(getZCXBitForceSCDeviceInfo());
    } else if (line.equals(ZLX)){
      Serial.println("Got ZLX");
      //Serial.println(getZLXTemperatures());
    } else if (line.equals(ZFX)){
      Serial.println("Got ZFX");
      //Serial.println(getZFXFirmwareVersion());
    } 
}


int main(void)
{
	init();

	setup();
    
	for (;;)
		loop();
        
	return 0;
}
	 char CR = 13; // /r
	 char LF = 10; // /r


	 String getZCXBitForceSCDeviceInfo() {
		String s =  "DEVICE: BitFORCE SC";
//                     s += LF; 
//		       s += "FIRMWARE: 1.0.0";
//                     s += LF; 
//                     s += "ENGINES: 128";
//                     s += LF; 
//		       s += "JOBS IN QUEUE: 78";
//                     s += LF; 
//		       s += "RESULTS IN QUEUE: 16";
//                       s += LF; 
//		       s += "XLINK MODE: MASTER";
//                       s += LF; 
//		       s += "XLINK PRESENT: YES";
//                       s += LF; 
//		       s += "DEVICES IN CHAIN: 127";
//                       s += LF; 
//		       s += "OK";
//                       s += LF; 
//                       s += '\o'; 
	}
	
	 String getZTXVoltages() {
		return "3290,1001,12400";
	}
	
	 String getZLXTemperatures() {
		return "Temp1: 29, Temp2: 28";
	}
	
	 String getZFXFirmwareVersion() {
		return "1.0.0";
	}



