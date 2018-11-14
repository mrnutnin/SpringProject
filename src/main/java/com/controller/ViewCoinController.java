package com.controller;

import com.model.CoinMarket;
import com.model.CoinMarketList;
import com.Currency;
import java.text.NumberFormat;
import com.CoinMarketCap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewCoinController {

    @GetMapping("/coin")
    public String coin(Model model) {
        
        CoinMarketList coinMarkets = CoinMarketCap.ticker().convert(Currency.USD).get();

        NumberFormat numberFormat = NumberFormat.getInstance();
        // find a market
        CoinMarket btc = coinMarkets.getBySymbol("BTC");
        CoinMarket eth = coinMarkets.getBySymbol("ETH");
        CoinMarket xrp = coinMarkets.getBySymbol("XRP");
        CoinMarket bch = coinMarkets.getBySymbol("BCH");
        CoinMarket eos = coinMarkets.getBySymbol("EOS");
        CoinMarket xlm = coinMarkets.getBySymbol("XLM");
        CoinMarket ltc = coinMarkets.getBySymbol("LTC");
        CoinMarket ada = coinMarkets.getBySymbol("ADA");
        CoinMarket xmr = coinMarkets.getBySymbol("XMR");
        CoinMarket usdt = coinMarkets.getBySymbol("USDT");

        CoinMarketList coinTHB = CoinMarketCap.ticker().convert(Currency.THB).get();
        double btcTHB = coinTHB.getBySymbol("BTC").getTHBPriceQuote().getPrice();
        double ethTHB = coinTHB.getBySymbol("ETH").getTHBPriceQuote().getPrice();
        double xrpTHB = coinTHB.getBySymbol("XRP").getTHBPriceQuote().getPrice();
        double bchTHB = coinTHB.getBySymbol("BCH").getTHBPriceQuote().getPrice();
        double eosTHB = coinTHB.getBySymbol("EOS").getTHBPriceQuote().getPrice();
        double xlmTHB = coinTHB.getBySymbol("XLM").getTHBPriceQuote().getPrice();
        double ltcTHB = coinTHB.getBySymbol("LTC").getTHBPriceQuote().getPrice();
        double adaTHB = coinTHB.getBySymbol("ADA").getTHBPriceQuote().getPrice();
        double xmrTHB = coinTHB.getBySymbol("XMR").getTHBPriceQuote().getPrice();
        double usdtTHB = coinTHB.getBySymbol("USDT").getTHBPriceQuote().getPrice();

        model.addAttribute("btcName", btc.getName());
        model.addAttribute("btcPrice", numberFormat.format((float) btc.getUSDPriceQuote().getPrice()));
        model.addAttribute("btcSymbol", btc.getSymbol());
        model.addAttribute("btcRank", btc.getRank());
        model.addAttribute("btcCirculatingSupply", numberFormat.format((int) btc.getCirculatingSupply()));
        model.addAttribute("btcDayVolume", numberFormat.format(btc.getUSDPriceQuote().getDayVolume()));
        model.addAttribute("btcLastUpdate", btc.getLastUpdatedDate());
        model.addAttribute("btcTHB", numberFormat.format((btcTHB)));

        model.addAttribute("ethName", eth.getName());
        model.addAttribute("ethPrice", numberFormat.format((float) eth.getUSDPriceQuote().getPrice()));
        model.addAttribute("ethSymbol", eth.getSymbol());
        model.addAttribute("ethRank", eth.getRank());
        model.addAttribute("ethCirculatingSupply", numberFormat.format((int) eth.getCirculatingSupply()));
        model.addAttribute("ethDayVolume", numberFormat.format(eth.getUSDPriceQuote().getDayVolume()));
        model.addAttribute("ethTHB", numberFormat.format((ethTHB)));

        model.addAttribute("xrpName", xrp.getName());
        model.addAttribute("xrpPrice", (float) xrp.getUSDPriceQuote().getPrice());
        model.addAttribute("xrpSymbol", xrp.getSymbol());
        model.addAttribute("xrpRank", xrp.getRank());
        model.addAttribute("xrpCirculatingSupply", numberFormat.format((int) xrp.getCirculatingSupply()));
        model.addAttribute("xrpDayVolume", numberFormat.format(xrp.getUSDPriceQuote().getDayVolume()));
        model.addAttribute("xrpTHB", numberFormat.format((xrpTHB)));

        model.addAttribute("bchName", bch.getName());
        model.addAttribute("bchPrice", (float) bch.getUSDPriceQuote().getPrice());
        model.addAttribute("bchSymbol", bch.getSymbol());
        model.addAttribute("bchRank", bch.getRank());
        model.addAttribute("bchCirculatingSupply", numberFormat.format((int) bch.getCirculatingSupply()));
        model.addAttribute("bchDayVolume", numberFormat.format(bch.getUSDPriceQuote().getDayVolume()));
        model.addAttribute("bchTHB", numberFormat.format((bchTHB)));

        model.addAttribute("eosName", eos.getName());
        model.addAttribute("eosPrice", (float) eos.getUSDPriceQuote().getPrice());
        model.addAttribute("eosSymbol", eos.getSymbol());
        model.addAttribute("eosRank", eos.getRank());
        model.addAttribute("eosCirculatingSupply", numberFormat.format((int) eos.getCirculatingSupply()));
        model.addAttribute("eosDayVolume", numberFormat.format(eos.getUSDPriceQuote().getDayVolume()));
        model.addAttribute("eosTHB", numberFormat.format((eosTHB)));

        model.addAttribute("xlmName", xlm.getName());
        model.addAttribute("xlmPrice", (float) xlm.getUSDPriceQuote().getPrice());
        model.addAttribute("xlmSymbol", xlm.getSymbol());
        model.addAttribute("xlmRank", xlm.getRank());
        model.addAttribute("xlmCirculatingSupply", numberFormat.format((int) xlm.getCirculatingSupply()));
        model.addAttribute("xlmDayVolume", numberFormat.format(xlm.getUSDPriceQuote().getDayVolume()));
        model.addAttribute("xlmTHB", numberFormat.format((xlmTHB)));

        model.addAttribute("ltcName", ltc.getName());
        model.addAttribute("ltcPrice", (float) ltc.getUSDPriceQuote().getPrice());
        model.addAttribute("ltcSymbol", ltc.getSymbol());
        model.addAttribute("ltcRank", ltc.getRank());
        model.addAttribute("ltcCirculatingSupply", numberFormat.format((int) ltc.getCirculatingSupply()));
        model.addAttribute("ltcDayVolume", numberFormat.format(ltc.getUSDPriceQuote().getDayVolume()));
        model.addAttribute("ltcTHB", numberFormat.format((ltcTHB)));

        model.addAttribute("adaName", ada.getName());
        model.addAttribute("adaPrice", (float) ada.getUSDPriceQuote().getPrice());
        model.addAttribute("adaSymbol", ada.getSymbol());
        model.addAttribute("adaRank", ada.getRank());
        model.addAttribute("adaCirculatingSupply", numberFormat.format((int) ada.getCirculatingSupply()));
        model.addAttribute("adaDayVolume", numberFormat.format(ada.getUSDPriceQuote().getDayVolume()));
        model.addAttribute("adaTHB", numberFormat.format((adaTHB)));

        model.addAttribute("xmrName", xmr.getName());
        model.addAttribute("xmrPrice", (float) xmr.getUSDPriceQuote().getPrice());
        model.addAttribute("xmrSymbol", xmr.getSymbol());
        model.addAttribute("xmrRank", xmr.getRank());
        model.addAttribute("xmrCirculatingSupply", numberFormat.format((int) xmr.getCirculatingSupply()));
        model.addAttribute("xmrDayVolume", numberFormat.format(xmr.getUSDPriceQuote().getDayVolume()));
        model.addAttribute("xmrTHB", numberFormat.format((xmrTHB)));

        model.addAttribute("usdtName", usdt.getName());
        model.addAttribute("usdtPrice", (float) usdt.getUSDPriceQuote().getPrice());
        model.addAttribute("usdtSymbol", usdt.getSymbol());
        model.addAttribute("usdtRank", usdt.getRank());
        model.addAttribute("usdtCirculatingSupply", numberFormat.format((int) usdt.getCirculatingSupply()));
        model.addAttribute("usdtDayVolume", numberFormat.format(usdt.getUSDPriceQuote().getDayVolume()));
        model.addAttribute("usdtTHB", numberFormat.format((usdtTHB)));

        return "/home";
    }

}