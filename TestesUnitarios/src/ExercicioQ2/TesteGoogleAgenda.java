package ExercicioQ2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;

public class TesteGoogleAgenda {
	
	private Reuniao a;
	private Reuniao b;
	private Reuniao c;
	private Reuniao d;
	private GoogleAgenda google;

	
	@Before
	public void setUp() {
		google = new GoogleAgenda();
		a = new Reuniao (new Data ((short) 10, (short) 11, (short) 2020, (short) 12, (short) 13), new ArrayList <String> (Arrays.asList ("José", "Roberto")));
		b = new Reuniao (new Data ((short) 9, (short) 11, (short) 2020, (short) 12, (short) 15), new ArrayList <String> (Arrays.asList ("José", "Roberto")));
		c = new Reuniao (new Data ((short) 11, (short) 11, (short) 2020, (short) 12, (short) 16), new ArrayList <String> (Arrays.asList ("José ", "Roberto")));
		d = new Reuniao (new Data ((short) 12, (short) 11, (short) 2020, (short) 12, (short) 17), new ArrayList <String> (Arrays.asList ("José", "Roberto")));

	}

	@Test
	public void testToStringReuniao() {
	}
	
	@Test
	public void testAdicionaReuniao() {
		google.adicionarReuniao(a);
		assertEquals(1, google.getQuantidadeReunioes());
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		assertEquals(10, google.getQuantidadeReunioes());
		google.adicionarReuniao(d);
		assertEquals(20, google.getTamanhoReunioes());
		assertEquals(11, google.getQuantidadeReunioes());
		google.adicionarReuniao(d);
		google.adicionarReuniao(d);
		google.adicionarReuniao(d);
		assertEquals(14, google.getQuantidadeReunioes());
		google.adicionarReuniao(a);
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		assertEquals(24, google.getQuantidadeReunioes());
		assertEquals(40, google.getTamanhoReunioes());
	}

	@Test
	public void testDuplica(){
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		assertEquals(10, google.getTamanhoReunioes());
		google.adicionarReuniao(a);
		assertEquals(20, google.getTamanhoReunioes());
	}
	
	@Test
	public void testGetReunioesDia() {
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		google.adicionarReuniao(a);
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);

		for(Reuniao r: google.getReunioesDia(new Data ((short) 12, (short) 11, (short) 2020, (short) 12, (short) 17))) {
			assertEquals(12, r.getData().getDia());
			};
	
	}
	@Test
	public void testGetReuniaoMaisLonga() {

		google.adicionarReuniao(a);
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);

	}
	
	@Test
	public void TesteRemoverParticipante() {

		google.adicionarReuniao(a);
		google.adicionarReuniao(b);
		google.adicionarReuniao(c);
		google.adicionarReuniao(d);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.adicionarReuniao(a);
		google.removerParticipante("José");
		assertEquals(1,a.getParticipantes().size());
	}
}
