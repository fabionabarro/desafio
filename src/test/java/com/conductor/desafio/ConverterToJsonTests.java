package com.conductor.desafio;

import static org.junit.Assert.*;

import com.conductor.desafio.models.Terminal;
import com.conductor.desafio.services.ConverterToJson;
import org.junit.Test;

public class ConverterToJsonTests {
    @Test
    public void converterTest() {
        String terminalpost = "44332211;123;PWWIN;0;F04A2E4088B;4;8.00b3;0;16777216;PWWIN";
        Terminal terminal = ConverterToJson.convertStringTerminal(terminalpost);
        String[] values = terminalpost.split(";");
        assert terminal != null;
        int logic = (Integer.parseInt(values[0]));
        assertEquals(logic, 44332211);

        String serial = (values[1]);
        assertEquals(serial, "123");

        String model = (values[2]);
        assertEquals(model, "PWWIN");

        int sam = (Integer.parseInt(values[3]));
        assertEquals(sam, 0);

        String ptid = (values[4]);
        assertEquals(ptid, "F04A2E4088B");

        int plat = (Integer.parseInt(values[5]));
        assertEquals(plat, 4);

        String version = (values[6]);
        assertEquals(version, "8.00b3");

        int mxr = (Integer.parseInt(values[7]));
        assertEquals(mxr, 0);

        int mxf = (Integer.parseInt(values[8]));
        assertEquals(mxf, 16777216);

        String VERFM = (values[9]);
        assertEquals(VERFM, "PWWIN");
    }
}

