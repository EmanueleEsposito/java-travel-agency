package jana60;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalQuery;

public class Vacanza {
	// Attributi
	private String destinazione;
	private String dataFine;
	private String dataInizio;

	// Costruttore
	public Vacanza(String destinazione, String dataInizio, String dataFine) throws Exception {
		super();
		validaDestinazione(destinazione);
		validaDataInizio(dataInizio);
		validaDataFine(dataFine);

		this.destinazione = destinazione;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}
	// Metodi getter e setter

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) throws Exception {
		validaDestinazione(destinazione);
		this.destinazione = destinazione;
	}

	public String getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(String dataInizio) throws Exception {
		validaDataInizio(dataInizio);
		this.dataInizio = dataInizio;
	}

	public String getDataFine() {
		return dataFine;
	}

	public void setDataFine(String dataFine) throws Exception {
		validaDataFine(dataFine);
		this.dataFine = dataFine;
	}

	// metodi per validare
	// Metodo validazione destinazione
	private void validaDestinazione(String destinazioneInput) throws NullPointerException {
		if (destinazioneInput == null) {
			throw new NullPointerException("La destinazione non può essere null");
		}

	}

	// Metodo validazione data di inizio
	private void validaDataInizio(String dataInizio2) throws NullPointerException, Exception {
		if (dataInizio2 == null) {
			throw new NullPointerException("La data di inizio non puo essere nulla");

		}
		LocalDate oggi = LocalDate.now();
		if (oggi.isAfter(String(dataInizio2))) {
			throw new Exception("La data di inizio non può essere già passata");
		}
	}

	private ChronoLocalDate String(String dataInizio2) {
		return null;
	}

	// Metodo validazione data fine
	private void validaDataFine(String dataFineInput) throws NullPointerException, Exception {
		if (dataFineInput == null) {
			throw new NullPointerException("La data di fine non puo essere nulla");

		}
		ChronoLocalDate dataFineInput2 = null;
		ChronoLocalDate dataInizio2 = null;
		if (dataFineInput2.isBefore(dataInizio2)) {
			throw new Exception("La data di fine non può essere prima di quella di inizio");
		}
		// Metodo per calcolare la durata della vacanza in giorni,mesi,anni
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		TemporalAmount durataVacanza = Period.between((LocalDate) dataFineInput2, (LocalDate) dataInizio2);
		System.out.println("La vacanza dura:" + formatter.toFormat((TemporalQuery<?>) durataVacanza));
	}

}
