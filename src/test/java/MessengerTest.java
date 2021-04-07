import org.junit.Test;

import static org.mockito.Mockito.*;

public class MessengerTest {
    //create dummy obj
    Template template = mock(Template.class);
    Client client = mock(Client.class);

    //create mock obj
    MailServer mailServer = mock(MailServer.class);
    TemplateEngine templateEngine = mock(TemplateEngine.class);

    final String CLIENT_EMAIL = "frostmage@ti.ukdw.ac.id";
    final String CLIENT_MSG = "Hello World!";

    @Test
    public void shouldSendEmail(){
        //prepare SUT
        Messenger sut = new Messenger(mailServer, templateEngine);
        when(client.getEmail()).thenReturn("frostmage@ti.ukdw.ac.id");
        when(templateEngine.prepareMessage(template, client)).thenReturn("Hello World!");
        sut.sendMessage(client, template);
        verify(mailServer).send(CLIENT_EMAIL, CLIENT_MSG);
    }
}