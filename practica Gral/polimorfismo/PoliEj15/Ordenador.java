package PoliEj15;

class Ordenador {
    String codigoSerial;
    int numero;
    int ram;
    String procesador;
    String estado;

    public Ordenador(String codigoSerial, int numero, int ram, String procesador, String estado) {
        this.codigoSerial = codigoSerial;
        this.numero = numero;
        this.ram = ram;
        this.procesador = procesador;
        this.estado = estado;
    }

    public void informacion() {
        System.out.println("Codigo: " + codigoSerial + 
                           " Num: " + numero + 
                           " RAM: " + ram + "GB" +
                           " Proc: " + procesador + 
                           " Estado: " + estado);
    }
}

class Laboratorio {
    String nombre;
    int capacidad;
    Ordenador[] ordenadores;
    int nroOrdenadores;

    public Laboratorio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ordenadores = new Ordenador[capacidad];
        this.nroOrdenadores = 0;
    }

    public void agregarOrdenador(Ordenador o) {
        if(nroOrdenadores < capacidad) {
            ordenadores[nroOrdenadores++] = o;
        } else {
            System.out.println("No hay espacio en " + nombre);
        }
    }

    public void informacion(String estado) { 
        for(int i=0; i<nroOrdenadores; i++) {
            if(ordenadores[i].estado.equalsIgnoreCase(estado)) {
                ordenadores[i].informacion();
            }
        }
    }

    public void informacion(Laboratorio lab) {
        if(this.nombre.equals(lab.nombre)) {
            for(int i=0; i<nroOrdenadores; i++) {
                ordenadores[i].informacion();
            }
        }
    }

    public void informacion(int ramMin) { 
        for(int i=0; i<nroOrdenadores; i++) {
            if(ordenadores[i].ram > ramMin) {
                ordenadores[i].informacion();
            }
        }
    }

    public void trasladar(Laboratorio destino, int cantidad) {
        System.out.println("Antes del traslado:");
        this.informacion(this);
        destino.informacion(destino);

        for(int i=0; i<cantidad && nroOrdenadores>0; i++) {
            destino.agregarOrdenador(this.ordenadores[nroOrdenadores-1]);
            nroOrdenadores--;
        }

        System.out.println("Después del traslado:");
        this.informacion(this);
        destino.informacion(destino);
    }
}


