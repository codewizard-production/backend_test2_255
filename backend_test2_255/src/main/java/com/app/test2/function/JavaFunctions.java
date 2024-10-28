package com.app.test2.function;

import com.app.test2.model.Stage;
import com.app.test2.model.Startup;
import com.app.test2.model.FundingRound;
import com.app.test2.model.Founder;
import com.app.test2.model.Document;
import com.app.test2.model.Investor;
import com.app.test2.enums.RoundStatus;
import com.app.test2.enums.StageName;
import com.app.test2.converter.StageNameConverter;
import com.app.test2.converter.RoundStatusConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.test2.repository.FundingRoundRepository;
import com.app.test2.repository.StageRepository;
import com.app.test2.repository.DocumentRepository;
import com.app.test2.repository.InvestorRepository;
import com.app.test2.repository.FounderRepository;
import com.app.test2.repository.StartupRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
