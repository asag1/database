WITH __data(date, item, measure, price, code, usage_in_order, usage_on_sale) AS (
  VALUES
    ('2018-10-01', 'Optinis kabelis 12sk', 'vnt', 0.30, '00010-K', FALSE, FALSE),
    ('2018-10-16', 'Kas.12-ai skaid.su laik.', 'vnt', 0.40, '002213', TRUE, TRUE),
    ('2018-11-21', 'Komutatorius D-Link DGS-3627G 24 portų', 'vnt', 1.19, '002985', FALSE, FALSE),
    ('2019-01-04', 'Komutatorius D-Link DGS-3612G 12 portų', 'vnt', 0.89, '002986', TRUE, TRUE),
    ('2019-01-01', 'Sujungimo dėžutė CAT5E', 'vnt', 1.00, '003072', FALSE, FALSE),
    ('2017-10-01', 'JXP-6', 'vnt', 1.00, 'ATN_000008', TRUE, FALSE)
  )
SELECT * FROM __data;
