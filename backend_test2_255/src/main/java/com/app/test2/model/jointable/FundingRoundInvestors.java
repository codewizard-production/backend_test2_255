package com.app.test2.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

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

@Entity(name = "FundingRoundInvestors")
@Table(schema = "\"test2\"", name = "\"FundingRoundInvestors\"")
@Data
public class FundingRoundInvestors{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"RoundId\"")
	private Integer roundId;

    
    @Column(name = "\"InvestorId\"")
    private Integer investorId;
 
}