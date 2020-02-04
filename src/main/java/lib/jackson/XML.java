package lib.jackson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class XML {
	private static final XmlMapper xmlMapper = new XmlMapper();
	
	public void escreveLista(Set<?> lista, File arquivo, String filename) throws JsonGenerationException, JsonMappingException, IOException {
		xmlMapper.writeValue(arquivo, lista);
	}
	
	public Set<?> carrega(File arquivo, TypeReference typeReference, Set<?> lista) {
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(arquivo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro no arquivo!");
		}
		//TypeReference<List<Produto>> typeReference = new TypeReference<List<Produto>>() {};
		//List<Produto> lista = null;
		try {
			lista = (Set<?>) xmlMapper.readValue(inputStream, typeReference);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(lista.isEmpty()) {
			System.out.println("Lista vazia, inserir dados antes");
			return null;
		}
		return Collections.unmodifiableSet(lista);
	}
}
