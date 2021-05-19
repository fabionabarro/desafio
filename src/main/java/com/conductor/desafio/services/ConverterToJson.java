package com.conductor.desafio.services;

import com.conductor.desafio.models.Terminal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public  class ConverterToJson {
    final static Logger LOGGER = LoggerFactory.getLogger(ConverterToJson.class);
    public static Terminal convertStringTerminal(String terminalpost) {

        Terminal terminal = new Terminal();
        String[] values = terminalpost.split(";");
        try {
            terminal.setLogic(Integer.parseInt(values[0]));
            terminal.setSerial(values[1]);
            terminal.setModel(values[2]);
            terminal.setSam(Integer.parseInt(values[3]));
            terminal.setPtid(values[4]);
            terminal.setPlat(Integer.parseInt(values[5]));
            terminal.setVersion(values[6]);
            terminal.setMxr(Integer.parseInt(values[7]));
            terminal.setMxf(Integer.parseInt(values[8]));
            terminal.setVERFM(values[9]);
            return (terminal);
        } catch (Exception e) {
            LOGGER.info("Ocorreu um erro no método de converção {}", e.toString());
            return (null);
        }
    }
}
