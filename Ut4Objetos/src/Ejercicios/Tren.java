package Ejercicios;

public class Tren {
    private Locomotora locomotora;
    private Vagon[] vagones;
    private Maquinista maquinista;

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.setLocomotora(locomotora);
        this.setMaquinista(maquinista);
        this.vagones = new Vagon[5];
    }

    public void engancharVagon(Vagon vagon, int posicion) {
        if (posicion >= 0 && posicion < 5) {
            vagones[posicion] = vagon;
        }
    }

    public void desengancharVagon(int posicion) {
        if (posicion >= 0 && posicion < 5) {
            vagones[posicion] = null;
        }
    }

	public Locomotora getLocomotora() {
		return locomotora;
	}

	public void setLocomotora(Locomotora locomotora) {
		this.locomotora = locomotora;
	}

	public Maquinista getMaquinista() {
		return maquinista;
	}

	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}

   
}

