function mydisp()
{
	
	document.getElementById('cities').style.display = "block";

   var x =document.f1.state.options[document.f1.state.selectedIndex].text;	

	var apCities = new Array("Hyderabad","Vizag","Vijayawada","A","B","P");
	var tnCities = new Array("Chennai","Banglore","Coimbatore","Nellore","Terunveli","Hosur");
	var knCities = new Array("Mysore","Mandia","Raichur","Hubli","Hasan","Bellary");
	var mnCities = new Array("Mumbai","Pune","Nagpur","Kurla","Thane","Bandra");
	var ksCities = new Array("Jammu","Kashmir","Udham","Vashno","A","B");
	var keralaCities = new Array("Kochi","Trnddrim","Palakkad","Kottayam","LuluMall","Wayanad");
	var telanganaCities = new Array("Hyderabad","Warangal","KarimNagar","Secundarabad","Kappam","Medhak");
	var odishaCities = new Array("Bhubaneshwar","Cuttack","Ganjam","Puri");
	var upCitites = new Array("Lucknow","Mirzapur","Jaunpur","Balia","Noida")
	var mpCitites = new Array("Indore","Bhopal","Ujjain","Gwalior","Jabalpur")
	var upCititesCodes = new Array("LK","MI","JP","BL","NO")

	var y = document.f1.cities;

	if(x=="AndhraPradesh")
	{
		y.length = 0;
		for(i=0;i<apCities.length;i++)
		{
			option = new Option(apCities[i]);
			y.options[i] = option;
      	}
   	}
	if(x=="TamilNadu")
	{
		y.length = 0;
		for(i=0;i<tnCities.length;i++)
		{
			option = new Option(tnCities[i]);
			y.options[i] = option;
		}
   	}
	if(x=="Karnataka")
	{
		y.length = 0;
		for(i=0;i<knCities.length;i++)
		{
			option = new Option(knCities[i]);
			y.options[i] = option;
		}
   	}
	if(x=="Maharashtra")
	{
		y.length = 0;
		for(i=0;i<mnCities.length;i++)
		{
			option = new Option(mnCities[i]);
			y.options[i] = option;
		}
   	}
	if(x=="Kashmir")
	{
		y.length = 0;
		for(i=0;i<ksCities.length;i++)
		{
			a= new Option(ksCities[i]);
			y.options[i] = a;
		}
   	}
	if(x=="Kerala")
	{
		y.length = 0;
		for(i=0;i<keralaCities.length;i++)
		{
			a = new Option(keralaCities[i]);
			y.options[i] = a;
		}
   	}
	if(x=="Telangana")
	{
		y.length = 0;
		for(i=0;i<telanganaCities.length;i++)
		{
			option = new Option(telanganaCities[i],telanganaCities[i]);
			y.options[i] = option;
      	}
   	}
	if(x=="Odisha")
	{
		y.length = 0;
		for(i=0;i<odishaCities.length;i++)
		{
			option = new Option(odishaCities[i],odishaCities[i]);
			y.options[i] = option;
      	}
   	}
	   if(x=="UttarPradesh")
		{
			y.length = 0;
			for(i=0;i<upCitites.length;i++)
			{
				option = new Option(upCitites[i],upCitites[i]);
				y.options[i] = option;
			  }
		   }
		   
		     if(x=="MadhyaPradesh")
		{
			y.length = 0;
			for(i=0;i<mpCitites.length;i++)
			{
				option = new Option(mpCitites[i],mpCitites[i]);
				y.options[i] = option;
			  }
		   }
}