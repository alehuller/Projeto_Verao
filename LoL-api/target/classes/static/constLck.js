const options = [
    { value: "Aatrox", text: "Aatrox" },
    { value: "Ahri", text: "Ahri" },
    { value: "Akali", text: "Akali" },
    { value: "Akshan", text: "Akshan" },
    { value: "Alistar", text: "Alistar" },
    { value: "Amumu", text: "Amumu" },
    { value: "Anivia", text: "Anivia" },
    { value: "Annie", text: "Annie" },
    { value: "Aphelios", text: "Aphelios" },
    { value: "Ashe", text: "Ashe" },
    { value: "Aurelion Sol", text: "Aurelion Sol" },
    { value: "Azir", text: "Azir" },
    { value: "Bard", text: "Bard" },
    { value: "Bel'Veth", text: "Bel'Veth" },
    { value: "Blitzcrank", text: "Blitzcrank" },
    { value: "Brand", text: "Brand" },
    { value: "Braum", text: "Braum" },
    { value: "Briar", text: "Briar" },
    { value: "Caitlyn", text: "Caitlyn" },
    { value: "Camille", text: "Camille" },
    { value: "Cassiopeia", text: "Cassiopeia" },
    { value: "Cho'Gath", text: "Cho'Gath" },
    { value: "Corki", text: "Corki" },
    { value: "Darius", text: "Darius" },
    { value: "Diana", text: "Diana" },
    { value: "Dr. Mundo", text: "Dr. Mundo" },
    { value: "Draven", text: "Draven" },
    { value: "Ekko", text: "Ekko" },
    { value: "Elise", text: "Elise" },
    { value: "Evelynn", text: "Evelynn" },
    { value: "Ezreal", text: "Ezreal" },
    { value: "Fiddlesticks", text: "Fiddlesticks" },
    { value: "Fiora", text: "Fiora" },
    { value: "Fizz", text: "Fizz" },
    { value: "Galio", text: "Galio" },
    { value: "Gangplank", text: "Gangplank" },
    { value: "Garen", text: "Garen" },
    { value: "Gnar", text: "Gnar" },
    { value: "Gragas", text: "Gragas" },
    { value: "Graves", text: "Graves" },
    { value: "Gwen", text: "Gwen" },
    { value: "Hecarim", text: "Hecarim" },
    { value: "Heimerdinger", text: "Heimerdinger" },
    { value: "Hwei", text: "Hwei" },
    { value: "Illaoi", text: "Illaoi" },
    { value: "Irelia", text: "Irelia" },
    { value: "Ivern", text: "Ivern" },
    { value: "Janna", text: "Janna" },
    { value: "Jarvan IV", text: "Jarvan IV" },
    { value: "Jax", text: "Jax" },
    { value: "Jayce", text: "Jayce" },
    { value: "Jhin", text: "Jhin" },
    { value: "Jinx", text: "Jinx" },
    { value: "K'Sante", text: "K'Sante" },
    { value: "Kai'Sa", text: "Kai'Sa" },
    { value: "Kalista", text: "Kalista" },
    { value: "Karma", text: "Karma" },
    { value: "Karthus", text: "Karthus" },
    { value: "Kassadin", text: "Kassadin" },
    { value: "Katarina", text: "Katarina" },
    { value: "Kayle", text: "Kayle" },
    { value: "Kayn", text: "Kayn" },
    { value: "Kennen", text: "Kennen" },
    { value: "Kha'Zix", text: "Kha'Zix" },
    { value: "Kindred", text: "Kindred" },
    { value: "Kled", text: "Kled" },
    { value: "Kog'Maw", text: "Kog'Maw" },
    { value: "LeBlanc", text: "LeBlanc" },
    { value: "Lee Sin", text: "Lee Sin" },
    { value: "Leona", text: "Leona" },
    { value: "Lillia", text: "Lillia" },
    { value: "Lissandra", text: "Lissandra" },
    { value: "Lucian", text: "Lucian" },
    { value: "Lulu", text: "Lulu" },
    { value: "Lux", text: "Lux" },
    { value: "Malphite", text: "Malphite" },
    { value: "Malzahar", text: "Malzahar" },
    { value: "Maokai", text: "Maokai" },
    { value: "Master Yi", text: "Master Yi" },
    { value: "Milio", text: "Milio" },
    { value: "Miss Fortune", text: "Miss Fortune" },
    { value: "Mordekaiser", text: "Mordekaiser" },
    { value: "Morgana", text: "Morgana" },
    { value: "Naafiri", text: "Naafiri" },
    { value: "Nami", text: "Nami" },
    { value: "Nasus", text: "Nasus" },
    { value: "Nautilus", text: "Nautilus" },
    { value: "Neeko", text: "Neeko" },
    { value: "Nidalee", text: "Nidalee" },
    { value: "Nilah", text: "Nilah" },
    { value: "Nocturne", text: "Nocturne" },
    { value: "Nunu & Willump", text: "Nunu & Willump" },
    { value: "Olaf", text: "Olaf" },
    { value: "Orianna", text: "Orianna" },
    { value: "Ornn", text: "Ornn" },
    { value: "Pantheon", text: "Pantheon" },
    { value: "Poppy", text: "Poppy" },
    { value: "Pyke", text: "Pyke" },
    { value: "Qiyana", text: "Qiyana" },
    { value: "Quinn", text: "Quinn" },
    { value: "Rakan", text: "Rakan" },
    { value: "Rammus", text: "Rammus" },
    { value: "Rek'Sai", text: "Rek'Sai" },
    { value: "Rell", text: "Rell" },
    { value: "Renata Glasc", text: "Renata Glasc" },
    { value: "Renekton", text: "Renekton" },
    { value: "Rengar", text: "Rengar" },
    { value: "Riven", text: "Riven" },
    { value: "Rumble", text: "Rumble" },
    { value: "Ryze", text: "Ryze" },
    { value: "Samira", text: "Samira" },
    { value: "Sejuani", text: "Sejuani" },
    { value: "Senna", text: "Senna" },
    { value: "Seraphine", text: "Seraphine" },
    { value: "Sett", text: "Sett" },
    { value: "Shaco", text: "Shaco" },
    { value: "Shen", text: "Shen" },
    { value: "Shyvana", text: "Shyvana" },
    { value: "Singed", text: "Singed" },
    { value: "Sion", text: "Sion" },
    { value: "Sivir", text: "Sivir" },
    { value: "Skarner", text: "Skarner" },
    { value: "Sona", text: "Sona" },
    { value: "Soraka", text: "Soraka" },
    { value: "Swain", text: "Swain" },
    { value: "Sylas", text: "Sylas" },
    { value: "Syndra", text: "Syndra" },
    { value: "Tahm Kench", text: "Tahm Kench" },
    { value: "Taliyah", text: "Taliyah" },
    { value: "Talon", text: "Talon" },
    { value: "Taric", text: "Taric" },
    { value: "Teemo", text: "Teemo" },
    { value: "Thresh", text: "Thresh" },
    { value: "Tristana", text: "Tristana" },
    { value: "Trundle", text: "Trundle" },
    { value: "Tryndamere", text: "Tryndamere" },
    { value: "Twisted Fate", text: "Twisted Fate" },
    { value: "Twitch", text: "Twitch" },
    { value: "Udyr", text: "Udyr" },
    { value: "Urgot", text: "Urgot" },
    { value: "Varus", text: "Varus" },
    { value: "Vayne", text: "Vayne" },
    { value: "Veigar", text: "Veigar" },
    { value: "Vel'Koz", text: "Vel'Koz" },
    { value: "Vex", text: "Vex" },
    { value: "Vi", text: "Vi" },
    { value: "Viego", text: "Viego" },
    { value: "Viktor", text: "Viktor" },
    { value: "Vladimir", text: "Vladimir" },
    { value: "Volibear", text: "Volibear" },
    { value: "Warwick", text: "Warwick" },
    { value: "Wukong", text: "Wukong" },
    { value: "Xayah", text: "Xayah" },
    { value: "Xerath", text: "Xerath" },
    { value: "Xin Zhao", text: "Xin Zhao" },
    { value: "Yasuo", text: "Yasuo" },
    { value: "Yone", text: "Yone" },
    { value: "Yorick", text: "Yorick" },
    { value: "Yuumi", text: "Yuumi" },
    { value: "Zac", text: "Zac" },
    { value: "Zed", text: "Zed" },
    { value: "Zeri", text: "Zeri" },
    { value: "Ziggs", text: "Ziggs" },
    { value: "Zilean", text: "Zilean" },
    { value: "Zoe", text: "Zoe" },
    { value: "Zyra", text: "Zyra" }
];

const teamslck = [
    { value: "Dplus KIA", text: "Dplus KIA" },
    { value: "DRX", text: "DRX" },
    { value: "FearX", text: "FearX" },
    { value: "Gen.G", text: "Gen.G" },
    { value: "Hanwha Life Esports", text: "Hanwha Life Esports" },
    { value: "KT Rolster", text: "KT Rolster" },
    { value: "Kwangdong Freecs", text: "Kwangdong Freecs" },
    { value: "Nongshim RedForce", text: "Nongshim RedForce" },
    { value: "OKSavingsBank BRION", text: "OKSavingsBank BRION" },
    { value: "T1", text: "T1" }
];

const teamslpl = [
    { value: "Anyone's Legend", text: "Anyone's Legend" },
    { value: "Bilibili Gaming", text: "Bilibili Gaming" },
    { value: "EDward Gaming", text: "EDward Gaming" },
    { value: "FunPlus Phoenix", text: "FunPlus Phoenix" },
    { value: "Invictus Gaming", text: "Invictus Gaming" },
    { value: "JD Gaming", text: "JD Gaming" },
    { value: "LGD Gaming", text: "LGD Gaming" },
    { value: "LNG Esports", text: "LNG Esports" },
    { value: "Ninjas in Pyjamas", text: "Ninjas in Pyjamas" },
    { value: "Oh My God", text: "Oh My God" },
    { value: "Rare Atom", text: "Rare Atom" },
    { value: "RNG", text: "RNG" },
    { value: "Team WE", text: "Team WE" },
    { value: "Top Esports", text: "Top Esports" },
    { value: "TT Gaming", text: "TT Gaming" },
    { value: "Ultra Prime", text: "Ultra Prime" },
    { value: "Weibo Gaming", text: "Weibo Gaming" }
];

const gameItems = [
    { name: "Dagger", cost: 300 },
    { name: "Kircheis Shard", cost: 700 },
    { name: "Rageknife", cost: 1200 },
    { name: "Recurve Bow", cost: 700 },
    { name: "Zeal", cost: 1100 },
    { name: "Runaans Hurricane", cost: 2800 },
    { name: "Long Sword", cost: 350 },
    { name: "Dorans Blade", cost: 450 },
    { name: "Spectral Sickle", cost: 400 },
    { name: "Steel Shoulderguards", cost: 400 },
    { name: "BF Sword", cost: 1300 },
    { name: "Pickaxe", cost: 875 },
    { name: "Caulfields Warhammer", cost: 1100 },
    { name: "Executioners Calling", cost: 800 },
    { name: "Harrowing Crescent", cost: 400 },
    { name: "HearthBound Axe", cost: 1100 },
    { name: "Hexdrinker", cost: 1300 },
    { name: "Ironspike Whip", cost: 1100 },
    { name: "Last Whisper", cost: 1450 },
    { name: "Noonquiver", cost: 1300 },
    { name: "Phage", cost: 1100 },
    { name: "Serrated Dirk", cost: 1100 },
    { name: "Tiamat", cost: 1200 },
    { name: "Vampiric Scepter", cost: 900 },
    { name: "Axiom Arc", cost: 3000 },
    { name: "Black Cleaver", cost: 3100 },
    { name: "Black Mist Scythe", cost: 400 },
    { name: "Blade of The Ruined King", cost: 3300 },
    { name: "Bloodthirster", cost: 3400 },
    { name: "Chempunk Chainsword", cost: 2800 },
    { name: "Deaths Dance", cost: 3300 },
    { name: "Essence Reaver", cost: 2900 },
    { name: "Guardian Angel", cost: 3000 },
    { name: "Hullbreaker", cost: 3000 },
    { name: "Immortal Shieldbow", cost: 3000 },
    { name: "Kraken Slayer", cost: 3000 },
    { name: "Lord Dominiks Regards", cost: 3000 },
    { name: "Manamune", cost: 2900 },
    { name: "Maw of Malmortius", cost: 2800 },
    { name: "Mercurial Scimitar", cost: 3000 },
    { name: "Mortal Reminder", cost: 3000 },
    { name: "Muramana", cost: 2900 },
    { name: "Pauldrons of Whiterock", cost: 400 },
    { name: "Phantom Dancer", cost: 2800 },
    { name: "Prowlers Claw", cost: 3000 },
    { name: "Rapid Firecannon", cost: 3000 },
    { name: "Ravenous Hydra", cost: 3400 },
    { name: "Serpents Fang", cost: 2600 },
    { name: "Seryldas Grudge", cost: 3200 },
    { name: "Spear of Shojin", cost: 3300 },
    { name: "Statikk Shiv", cost: 3000 },
    { name: "Steraks Gage", cost: 3000 },
    { name: "Stormrazor", cost: 3000 },
    { name: "The Collector", cost: 3000 },
    { name: "Titanic Hydra", cost: 3300 },
    { name: "Umbral Glaive", cost: 2300 },
    { name: "Wits End", cost: 3200 },
    { name: "Divine Sunderer", cost: 3300 },
    { name: "Duskblade of Draktharr", cost: 3100 },
    { name: "Eclipse", cost: 3100 },
    { name: "Galeforce", cost: 3400 },
    { name: "Goredrinker", cost: 3200 },
    { name: "Infinity Edge", cost: 3400 },
    { name: "Navori Quickblades", cost: 3400 },
    { name: "Stridebreaker", cost: 3300 },
    { name: "Trinity Force", cost: 3333 },
    { name: "Youmuus GhostBlade", cost: 3100 },
    { name: "Cull", cost: 450 },
    { name: "Dorans Ring", cost: 400 },
    { name: "Relic Shield", cost: 400 },
    { name: "Spellthiefs Edge", cost: 400 },
    { name: "Amplifying Tome", cost: 435 },
    { name: "Blasting Wand", cost: 850 },
    { name: "Needlessly Large Rod", cost: 1250 },
    { name: "Aether Wisp", cost: 850 },
    { name: "Bandleglass Mirror", cost: 950 },
    { name: "Blighting Jewel", cost: 1100 },
    { name: "Fiendish Codex", cost: 900 },
    { name: "Frostfang", cost: 400 },
    { name: "Hextech Alternator", cost: 1050 },
    { name: "Leeching Leer", cost: 1300 },
    { name: "Lost Chapter", cost: 1100 },
    { name: "Oblivion Orb", cost: 800 },
    { name: "Seekers Armguard", cost: 1000 },
    { name: "Verdant Barrier", cost: 1000 },
    { name: "Archangels Staff", cost: 3000 },
    { name: "Ardent Censer", cost: 2100 },
    { name: "Banshees Veil", cost: 2600 },
    { name: "Bulwark of the Mountain", cost: 400 },
    { name: "Chemtech Putrifier", cost: 2100 },
    { name: "Cosmic Drive", cost: 3000 },
    { name: "Demonic Embrace", cost: 3000 },
    { name: "Horizon Focus", cost: 3000 },
    { name: "Imperial Mandate", cost: 2300 },
    { name: "Lich Bane", cost: 3000 },
    { name: "Mejais Soulstealer", cost: 1600 },
    { name: "Morellonomicon", cost: 3000 },
    { name: "Nashors Tooth", cost: 3200 },
    { name: "Rabadons Deathcap", cost: 3600 },
    { name: "Rylais Crystal Scepter", cost: 2600 },
    { name: "Seraphs Embrace", cost: 3000 },
    { name: "Shadowflame", cost: 3000 },
    { name: "Shard of True Ice", cost: 400 },
    { name: "Staff of Flowing Water", cost: 2100 },
    { name: "Void Staff", cost: 2800 },
    { name: "Zhonyas Hourglass", cost: 3000 },
    { name: "Crown of the Shattered", cost: 2800 },
    { name: "Everfrost", cost: 2800 },
    { name: "Guinsoos Rageblade", cost: 3200 },
    { name: "Hextech Rocketbelt", cost: 3200 },
    { name: "Liandrys Anguish", cost: 3200 },
    { name: "Ludens Tempest", cost: 3200 },
    { name: "Moonstone Renewer", cost: 2300 },
    { name: "Night Harvester", cost: 3200 },
    { name: "Riftmaker", cost: 3200 },
    { name: "Rod of Ages", cost: 2800 },
    { name: "Shurelyas Battlesong", cost: 2300 },
    { name: "Dorans Shield", cost: 450 },
    { name: "Cloth Armor", cost: 300 },
    { name: "Null-Magic Mantle", cost: 450 },
    { name: "Ruby Crystal", cost: 400 },
    { name: "Aegis of the Legion", cost: 1200 },
    { name: "Bamis Cinder", cost: 1000 },
    { name: "Bramble Vest", cost: 800 },
    { name: "Catalyst of Aeons", cost: 1300 },
    { name: "Chain Vest", cost: 800 },
    { name: "Giants Belt", cost: 900 },
    { name: "Glacial Buckler", cost: 900 },
    { name: "Kindlegem", cost: 800 },
    { name: "Lifewell Pendant", cost: 1050 },
    { name: "Negatron Cloak", cost: 900 },
    { name: "Quicksilver Sash", cost: 1300 },
    { name: "Spectres Cowl", cost: 1250 },
    { name: "Wardens Mail", cost: 1000 },
    { name: "Winged Moonplate", cost: 800 },
    { name: "Abyssal Mask", cost: 2400 },
    { name: "Anathemas Chains", cost: 2500 },
    { name: "Dead Mans Plate", cost: 2900 },
    { name: "Fimbulwinter", cost: 2600 },
    { name: "Force of Nature", cost: 2800 },
    { name: "Frozen Heart", cost: 2700 },
    { name: "Gargoyle Stoneplate", cost: 3200 },
    { name: "Knights Vow", cost: 2200 },
    { name: "Randuins Omen", cost: 2700 },
    { name: "Redemption", cost: 2300 },
    { name: "Spirit Visage", cost: 2900 },
    { name: "Sunfire Aegis", cost: 2700 },
    { name: "Thornmail", cost: 2700 },
    { name: "Turbo Chemtank", cost: 2800 },
    { name: "Warmogs Armor", cost: 3000 },
    { name: "Winters Approach", cost: 2600 },
    { name: "Zekes Convergence", cost: 2200 },
    { name: "Evenshroud", cost: 2300 },
    { name: "Heartsteel", cost: 3200 },
    { name: "Iceborn Gauntlet", cost: 3000 },
    { name: "Jak'Sho, The Protean", cost: 3200 },
    { name: "Locket of The Iron Solari", cost: 2300 },
    { name: "Radiant Virtue", cost: 2700 }
];

function populateSelectWithItems(selectId, items) {
    const select = document.getElementById(selectId);
    items.forEach(item => {
        const optionElement = document.createElement("option");
        optionElement.value = item.name;
        optionElement.textContent = `${item.name}`;
        select.appendChild(optionElement);
    });
}

populateSelectWithItems('item', gameItems);
populateSelectWithItems('itemtopp', gameItems);
populateSelectWithItems('itemjunglee', gameItems); 
populateSelectWithItems('itemmidd', gameItems); 
populateSelectWithItems('itemadcc', gameItems); 
populateSelectWithItems('itemsup', gameItems); 
populateSelectWithItems('itemjg', gameItems); 
populateSelectWithItems('itemmmid', gameItems);
populateSelectWithItems('itemaadc', gameItems);
populateSelectWithItems('itemssup', gameItems);   



document.getElementById('campeonato').addEventListener('change', function() {
    const campeonatoEscolhido = this.value;
    let equipes;
    if (campeonatoEscolhido === 'LPL') {
        equipes = teamslpl;
    } else if (campeonatoEscolhido === 'LCK') {
        equipes = teamslck;
    }

    // Limpar opções existentes
    clearSelectOptions('timeazul');
    clearSelectOptions('timevermelho');

    // Preencher com novas opções
    populateSelect('timeazul', equipes);
    populateSelect('timevermelho', equipes);
});

function clearSelectOptions(selectId) {
    const select = document.getElementById(selectId);
    while (select.firstChild) {
        select.removeChild(select.firstChild);
    }
}

function populateSelect(selectId, data) {
    const select = document.getElementById(selectId);
    data.forEach(item => {
        const optionElement = document.createElement("option");
        optionElement.value = item.value;
        optionElement.textContent = item.text;
        select.appendChild(optionElement);
    });
}

// Preencher as seleções iniciais com os dados da LPL por padrão
populateSelect('timeazul', teamslpl);
populateSelect('timevermelho', teamslpl);

