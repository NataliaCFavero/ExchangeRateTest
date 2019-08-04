package com.favero.exchangerate.exchangeRate.interactor;

import com.favero.exchangerate.exchangeRate.model.ExchangeRateResponse;
import com.favero.exchangerate.exchangeRate.presenter.ExchangeRatePresenter;
import com.favero.exchangerate.service.ExchangeRateService;
import com.squareup.okhttp.mockwebserver.MockResponse;
import com.squareup.okhttp.mockwebserver.MockWebServer;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@RunWith(MockitoJUnitRunner.class)
public class ExchangeRateInteractorImplTest {

    @Mock
    ExchangeRatePresenter presenter;

    private ExchangeRateInteractor interactor;

    @Before
    public void setUp() throws Exception {
        interactor = new ExchangeRateInteractorImpl(presenter);
    }

    @Test
    public void updateExchangeRates_Test_Update_Time() throws Exception {
        interactor.updateExchangeRates();
        interactor.destroy();
    }

    @Test
    public void updateExchangeRates_Test_Error_Service() {
        interactor.updateExchangeRates();
    }

    @Test
    public void updateExchangeRates_Test_Success_Service() {
        interactor.updateExchangeRates();
    }

    @Test
    public void destroy_Test_Timer() {
    }

    public class test implements ExchangeRateService.ApiService {

        @Override
        public Call<ExchangeRateResponse> getExchangeRates() {
            MockWebServer mockWebServer = new MockWebServer();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(mockWebServer.url("").toString())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            mockWebServer.enqueue(new MockResponse().setBody( "{\n" +
                    "\"rates\": {\n" +
                    "\"CAD\": 1.4698,\n" +
                    "\"HKD\": 8.6924,\n" +
                    "\"ISK\": 136.3,\n" +
                    "\"PHP\": 57.307,\n" +
                    "\"DKK\": 7.466,\n" +
                    "\"HUF\": 326.96,\n" +
                    "\"CZK\": 25.763,\n" +
                    "\"AUD\": 1.6365,\n" +
                    "\"RON\": 4.7345,\n" +
                    "\"SEK\": 10.7223,\n" +
                    "\"IDR\": 15772.45,\n" +
                    "\"INR\": 77.34,\n" +
                    "\"BRL\": 4.2958,\n" +
                    "\"RUB\": 72.5055,\n" +
                    "\"HRK\": 7.3815,\n" +
                    "\"JPY\": 118.57,\n" +
                    "\"THB\": 34.157,\n" +
                    "\"CHF\": 1.0931,\n" +
                    "\"SGD\": 1.529,\n" +
                    "\"PLN\": 4.3014,\n" +
                    "\"BGN\": 1.9558,\n" +
                    "\"TRY\": 6.2221,\n" +
                    "\"CNY\": 7.7058,\n" +
                    "\"NOK\": 9.9105,\n" +
                    "\"NZD\": 1.7026,\n" +
                    "\"ZAR\": 16.3271,\n" +
                    "\"USD\": 1.1106,\n" +
                    "\"MXN\": 21.4542,\n" +
                    "\"ILS\": 3.8786,\n" +
                    "\"GBP\": 0.91505,\n" +
                    "\"KRW\": 1333.44,\n" +
                    "\"MYR\": 4.6173\n" +
                    "},\n" +
                    "\"base\": \"EUR\",\n" +
                    "\"date\": \"2019-08-02\"\n" +
                    "}"));

            final ExchangeRateService.ApiService service = retrofit.create(ExchangeRateService.ApiService.class);

            return service.getExchangeRates();
        }
    }
}